package task2;

public class DefaultStack implements Stack {
    private final int MAX_SIZE = 5;
    private final int[] nums = new int[MAX_SIZE];
    private int index = 0;

    @Override
    public void push(int val) {
        if (index == MAX_SIZE) {
            throw new StackIndexOutOfBoundsException();
        }
        nums[index++] = val;
    }

    @Override
    public int pop() {
        int temp;
        if (index == 0) {
            throw new EmptyStackException();
        }
        temp = nums[--index];
        nums[index] = 0;
        return temp;
    }
}
