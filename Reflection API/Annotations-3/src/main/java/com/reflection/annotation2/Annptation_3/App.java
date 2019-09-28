package com.reflection.annotation2.Annptation_3;

import java.lang.annotation.Annotation;

public class App {
	public static void main(String[] args) {
		Class<EmpDao> cls = EmpDao.class;
		Annotation[] annotations = cls.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof Author) {
				Author author = (Author) annotation;
				System.out.println(author.name());
			} else if (annotation instanceof Version) {
				Version version = (Version) annotation;
				System.out.println(version.no());
			}
		}

	}
}
