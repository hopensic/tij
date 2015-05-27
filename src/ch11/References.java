package ch11;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

import tools.P;

class VeryBig {
	private static final int SZ = 10000;
	private double[] d = new double[SZ];
	private String ident;

	public VeryBig(String id) {
		ident = id;
	}

	public String toString() {
		return ident;
	}

	public void finalize() {
		P.lnrint("Finalizing " + ident);
	}
}

public class References {
	private static ReferenceQueue rq = new ReferenceQueue();

	public static void checkQueue() {
		Object inq = rq.poll();
		if (inq != null)
			P.lnrint("In queue: " + (VeryBig) ((Reference) inq).get());
	}

	public static void main(String[] args) throws InterruptedException {
		int size = 10;
		if (args.length > 0)
			size = Integer.parseInt(args[0]);
		SoftReference[] sa = new SoftReference[size];
		for (int i = 0; i < sa.length; i++) {
			sa[i] = new SoftReference(new VeryBig("Soft " + i), rq);
			P.lnrint("Just created: " + (VeryBig) sa[i].get());
			checkQueue();
		}

		WeakReference[] wa = new WeakReference[size];
		for (int i = 0; i < wa.length; i++) {
			wa[i] = new WeakReference(new VeryBig("Soft " + i), rq);
			P.lnrint("Just created: " + (VeryBig) wa[i].get());
			checkQueue();
		}

		SoftReference s = new SoftReference(new VeryBig("Soft"));
		WeakReference w = new WeakReference(new VeryBig("Soft"));

		Object a = wa[4];
		Map m = new HashMap();
		m.put("a", wa[4]);

		System.gc();

		// Thread.sleep(5000);
		//
		// PhantomReference[] pa = new PhantomReference[size];
		// for (int i = 0; i < pa.length; i++) {
		// pa[i] = new PhantomReference(new VeryBig("Phantom " + i), rq);
		// P.lnrint("Just created: " + (VeryBig) pa[i].get());
		// Thread.sleep(2000);
		// checkQueue();
		// }

	}
}
