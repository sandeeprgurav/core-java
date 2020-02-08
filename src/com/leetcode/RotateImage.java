package com.leetcode;

public class RotateImage {
  /* Rotate Image 90 degree
   * For
			a = [[1, 2, 3],
			     [4, 5, 6],
			     [7, 8, 9]]
			the output should be
			rotateImage(a) =
                 [[7, 4, 1],
                  [8, 5, 2],
                  [9, 6, 3]]
   */
	
	
	private static int [][] rotateImage(int [][] image) {
		int [][] rotateImage = new int[image.length][image.length];				
		for(int i=0;i<image.length;i++) {
			
			for(int j=0;j<image.length;j++) {
				rotateImage[i][j] = image[image.length-1-j][i];
			}
		}
		
		return rotateImage;
	}
	
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3},
		             {4, 5, 6},
		             {7, 8, 9}};
		System.out.println(displayArray(a));
		System.out.println(displayArray(rotateImage(a)));
	}
	
	static String displayArray(int [][] a){
		for(int i=0;i<a.length;i++) {
			System.out.println();
			for(int j=0;j<a.length;j++) {
				System.out.print(" "+a[i][j]);	
			}			
		}
		return "";
	}
	
}
