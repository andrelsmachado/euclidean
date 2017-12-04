import java.util.Arrays;

class Solution {
    public int solution(int N, int M) {
	int array[] = new int[N];
	int pos = 0;
	int cont = 0;
	while (array[pos]==0) {
	    cont++;
	    array[pos]++;
	    pos+=M;
	    pos%=N;
	}
	return cont;
    }
}
