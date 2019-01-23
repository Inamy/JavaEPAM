public class Student {
    private String fio;
    private int groupNumber;
    private int[] grad = new int[5];

    public Student(String fio, int groupNumber, int[] grad)
    {
        this.fio = fio;
        this.groupNumber = groupNumber;
        this.grad = grad;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getGrad() {
        return grad;
    }

    public void setGrad(int[] grad) {
        this.grad = grad;
    }
}


