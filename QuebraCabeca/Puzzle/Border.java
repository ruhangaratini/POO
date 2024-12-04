package Puzzle;

public class Border {
    private final boolean left;
    private final boolean right;
    private Part fitting;

    public Border(boolean left, boolean right) {
        this.left = left;
        this.right = right;
    }

    public Part getFitting() {
        return this.fitting;
    }

    public void setFitting(Part part) {
        this.fitting = part;
    }

    public boolean getLeft() {
        return left;
    }

    public boolean getRight() {
        return right;
    }

    public boolean checkFitting(Border reference) {
        return
            this.fitting == null &&
            this.left != reference.getRight() && this.right != reference.getLeft() &&
            this.left != this.right;
    }
}
