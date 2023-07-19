package P0;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= new int[5];
		//lowest bound/index =0
		//upper bound/index =(n-1) where n is the size of the array.
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		i[4]=5;
		System.out.println(i[2]);
		//ArrayIndexOutOfBoundsException is thrown when we use out of index value.
		
		//to get length of array.
		System.out.println(i.length);
		
		//to  get all value of array.
		for(int j=0;j<i.length;j++)
		
		System.out.println(i[j]);
	}

}
