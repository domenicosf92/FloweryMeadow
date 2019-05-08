package com.company;

public class Main {

    public static void main(String[] args) {
	Grid grid=new Grid();
		try {
			grid.setMines();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(grid);
		System.out.println(grid.checkPosition(3,4));
	}
}
