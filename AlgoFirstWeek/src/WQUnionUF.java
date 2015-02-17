
public class WQUnionUF {
	private int[] parent;
	private int[] size;
	private int count;
	
	public WQUnionUF(int N){
		count = N;
		parent=new int[N];
		for (int i = 0; i < N; i++) {
			parent[i]=i;
			size[i]=1;
		}
	}
	
	public int count(){
		return count;
	}
	public int find(int p){
		validate(p);
		while (p != parent[p]){
			p=parent[p];
		}
		return p;
	}
	
	private void validate(int p){
		int N=parent.length;
		if(p<0 || p>=N){
			throw new IndexOutOfBoundsException("index "+p+"not between 0 and "+N);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
