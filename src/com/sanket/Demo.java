package com.sanket;

public class Demo {

	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass("PSTR8789CS");
		ImmutableClass im1 = im.getPancardNumber("ASTk9873R");
		ImmutableClass im2 = im.getPancardNumber("PSTR8789CS");

		System.out.println(im == im1);
		System.out.println(im == im2);

	}

}
