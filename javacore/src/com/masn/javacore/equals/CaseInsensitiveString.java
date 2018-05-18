package com.masn.javacore.equals;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CaseInsensitiveString
 * @Description: TODO(忽略大小写字符串)
 * @author masn
 * @date 2018年5月16日 上午8:53:25
 */
public final class CaseInsensitiveString {
	
	public final String str;

	public CaseInsensitiveString(String str) {
		super();
		if(str == null)
			throw new NullPointerException();
		this.str = str;
	}

	@Override
	public boolean equals(Object o) {
        if(o instanceof CaseInsensitiveString)
        	return	str.equalsIgnoreCase(((CaseInsensitiveString) o).str);
		if(o instanceof String)
			return	str.equalsIgnoreCase(((String) o));
		return false;
	}
	
	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String str = "polish";
		System.out.println(cis.equals(str));
		System.out.println(str.equals(cis));
		List<CaseInsensitiveString> cisList = new ArrayList<>();
		cisList.add(cis);
		System.out.println(cisList.contains(str));	
	}
	
}