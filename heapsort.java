public class heapsort
{
    private int l;
    int arr[];
    heapsort()
    {
        arr=new int[]{10,1,7,4,2,3,5,6,9,8};
        l=arr.length;
    }
    private void maxHeapify(int i)
    {

        if(i<this.l)
        {
            int pos = i;
            int j = 2 * i + 1;
            if (j <= this.l - 1 && arr[pos] < arr[j])
                pos = j;
            j++;
            if (j <= this.l - 1 && arr[pos] < arr[j])
                pos = j;

            if(pos!=i) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                maxHeapify(pos);
            }
        }
    }

    private void buildMaxHeap()
    {
        for(int i=arr.length/2-1;i>=0;i--)
        {
            maxHeapify(i);
        }
    }

    private void heapSort()
    {
        int temp;
        for( this.l=this.l-1;this.l>=0;)
        {
            temp=arr[0];
            arr[0]=arr[this.l];
            arr[this.l]=temp;

            maxHeapify(0);
            this.l--;
        }
    }
    private  void printer()
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
        System.out.println(this.l);
    }
    public static void main(String args[])
    {
        heapsort hp=new heapsort();
        hp.printer();
        hp.buildMaxHeap();
        hp.printer();
        hp.heapSort();
        hp.printer();

    }
}
