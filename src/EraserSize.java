public enum EraserSize {
    TINY_ERASER(1),
    SMALL_ERASER(2),
    MIDUIM_ERASER(3),
    BIG_ERASER(4),
    LARGE_ERASER(5);

    private int size;

    EraserSize(int size) {
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
