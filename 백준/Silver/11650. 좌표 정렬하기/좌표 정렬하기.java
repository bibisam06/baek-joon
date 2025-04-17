import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.awt.Point;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  List<Point> pr = new ArrayList<>();// 좌표값을 받는 ,,
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) { //x좌표 y좌표 입력받기
			String[] strArr = br.readLine().split(" ");
	        int x = Integer.parseInt(strArr[0]);
	        int y = Integer.parseInt(strArr[1]);
	        pr.add(new Point(x, y));  
		}
		
		Collections.sort(pr, new pointComparator());
		
	
	// 정렬된 배열 출력
    for (Point point : pr) {
        System.out.println(point.x + " " +  point.y);
    }
		
	}
		
	}
	
class pointComparator implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		// TODO Auto-generated method stub
		if(o1.x != o2.x) {//x1,x2다른경우 
			return Integer.compare(o1.x, o2.x);
		}
		else {//x1. x2 같은 경우
			return Integer.compare(o1.y, o2.y);
		}
	}
}