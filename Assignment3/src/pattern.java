public class pattern {
	public static void main(String[] args) {
		int a=0,b=2;
		while(b>0){
		if(a==0){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
			a++;
		}
		else{
			for(int i=1,r=4;i<=4;i++,r--){
			for(int j=1;j<=r;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		}
		b--;
		}
		}
}
