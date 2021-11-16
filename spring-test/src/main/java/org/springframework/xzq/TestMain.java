package org.springframework.xzq;

import org.springframework.dao.IncorrectResultSizeDataAccessException;

import java.util.function.Consumer;

/**
 * @Author XZQ
 * @Date 2021/7/17 18:33
 **/
public class TestMain {
	public static void main(String[] args) {
		sizeRequirements(1,2);
	}
	private static <E extends IncorrectResultSizeDataAccessException> Consumer<E> sizeRequirements(
			int expectedSize, int actualSize) {
		return ex -> {
			System.out.println("sssss");
		};
	}

}
