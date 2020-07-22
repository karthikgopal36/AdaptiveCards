/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum ImageFillMode {
  Cover(0),
  RepeatHorizontally,
  RepeatVertically,
  Repeat;

  public final int swigValue() {
    return swigValue;
  }

  public static ImageFillMode swigToEnum(int swigValue) {
    ImageFillMode[] swigValues = ImageFillMode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ImageFillMode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ImageFillMode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ImageFillMode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ImageFillMode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ImageFillMode(ImageFillMode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

