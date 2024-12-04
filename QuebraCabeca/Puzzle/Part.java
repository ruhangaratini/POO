package Puzzle;

public class Part {
    private final Border top;
    private final Border right;
    private final Border bottom;
    private final Border left;

    public Part(Border top, Border right, Border bottom, Border left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    public boolean fitting(Part part) {
        if(this.top.checkFitting(part.bottom)) {
            this.top.setFitting(part);
            return true;
        }

        if(this.right.checkFitting(part.left)) {
            this.right.setFitting(part);
            return true;
        }

        if(this.bottom.checkFitting(part.top)) {
            this.bottom.setFitting(part);
            return true;
        }

        if(this.left.checkFitting(part.right)) {
            this.left.setFitting(part);
            return true;
        }

        return false;
    }

}
