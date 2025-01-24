package Chap07_2;

public class Elevator {
	
	int limit_up_floor = 10; //엘베 최고층
	int limit_down_floor = 0; //엘베 최저층. 0층이 최소
	int floor = 1; //현재층수 
	String help; //현재 층수나 정보 출력하는 문구
	
	void up() { //엘베 한층씩 올라감
		if(floor == limit_up_floor) {
			help = "마지막층입니다.";
		} else {
			floor++;
			help = floor + "층입니다.";
		}
	}
	
	void down() { //엘베 한층씩 내려감
		if(floor == limit_down_floor) {
			help = "처음층입니다.";
		} else {
			floor--;
			if(floor == limit_down_floor) {
				help = "처음층입니다.";
			}else {
				help = floor + "층입니다.";
			}
		}
	}
}
