package com.reflection.controllers;

import java.lang.reflect.Modifier;

import com.reflection.model.Ship;

public class Ref {
	public static void main(String[] args) {

		Class reflection = Ship.class;
		String nameClass = reflection.getName();
		int modifier = reflection.getModifiers();
		
		System.out.println(Modifier.isPrivate(modifier));
		System.out.println(Modifier.isPublic(modifier));
		System.out.println(Modifier.isProtected(modifier));
		System.out.println(nameClass);

		Class reflectionString = String.class;
		String reflectionStringName = reflectionString.getName();
		System.out.println(reflectionStringName);

	}
}
