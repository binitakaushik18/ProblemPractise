package com.designpattern.imagematrix;

/**
 * Created by binita on 26/02/15.
 * Given an image represented by an NxN matrix, where each pixel in the image is 4
 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */

public interface Imagematrix {

    Integer[][] rotateImage(Integer [][] imageMatrix);

}
