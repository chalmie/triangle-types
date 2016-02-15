public class Triangle {
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle (int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }

  public int getSideC() {
    return mSideC;
  }

  public boolean isEquilateral() {
    return mSideA == mSideB && mSideB == mSideC;
  }

  public boolean isIsosceles() {
    return mSideA == mSideB || mSideB == mSideC || mSideA == mSideC;
  }

  public boolean isScalene() {
    return true;
  }

  public boolean notTriangle() {
    return (mSideA + mSideB) < mSideC || (mSideC + mSideA) < mSideB || (mSideB + mSideC) < mSideA;
  }
}
