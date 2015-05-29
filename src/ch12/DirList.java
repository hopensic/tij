package ch12;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import tools.P;
import ch11.AlphabeticComparator;

class DirFilter implements FilenameFilter {
	private Pattern pattern;

	public DirFilter(String regex) {

		this.pattern = Pattern.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name) {

		return pattern.matcher(new File(name).getName()).matches();
	}

}

public class DirList {
	public static void main(String[] args) {
		File path = new File("E://");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list, new AlphabeticComparator());
		for (int i = 0; i < list.length; i++) {
			P.lnrint(list[i]);
		}
	}

}
