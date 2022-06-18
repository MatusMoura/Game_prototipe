public class GamejVelha {
    
    private char xOrO;

    public GamejVelha(){
        this.xOrO = ' ';
    }

    public char getXOrO() {
		return xOrO;
	}

	public void setXOrO(char xOrO) {
		if(this.xOrO == ' '){
            this.xOrO = xOrO;
        }else{
            System.out.print("Campo já usado");
        }
	}

	
}
