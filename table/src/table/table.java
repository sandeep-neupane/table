package table;



class multipleTable{
    int number;
    
    //constructure
    multipleTable(int num){
        this.number = num;
    }
    //setter function
    public void setNumber(int num){
        this.number = num;
    }
    public void printTable(){
        System.out.printf("Multiplication table for %d \n",this.number);
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d \n",this.number,i,this.number*i);
        }
    }
}

public class table {

	public static void main(String[] args) {
		// creating a object and calling constructure
		/*multipleTable mt = new multipleTable(5);
		mt.printTable();
		//updating the varibale
		mt.setNumber(3);
		mt.printTable();
		*/
		
		printStarts pt = new printStarts();
		pt.printPattern2(5);
		pt.printPattern1(5);
		
	}

}
