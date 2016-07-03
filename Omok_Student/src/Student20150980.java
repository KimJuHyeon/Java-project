public class Student20150980 extends WinCheck {
	
	public boolean winCheck(int x, int y, char color, char map[][]) {			
		
		System.out.println(x + " " + y + " " + color + " " + map[x][y]);
		int key = 0;
		for(int i = 0; i < map.length; i++) 		{
			for(int j = 0; j < map.length-4; j++) {
					if(map[i][j] == color && map[i][j+1] == color && map[i][j+2] == color && map[i][j+3] == color && map[i][j+4] == color ) {					
						key = 1; 
						if((j+5) < map.length) {
							if(map[i][j+5] == color) { return false; }
						}
					}					
			}
		}
		for(int i = 0; i < map.length-4; i++) {
			for(int j = 0; j < map.length; j++) {
					if(map[i][j] == color && map[i+1][j] == color && map[i+2][j] == color && map[i+3][j] == color && map[i+4][j] == color ) {
						key = 2; 
						if((i+5) < map.length) {
							if(map[i+5][j] == color) { return false; }
						}
					}
		
			}
		}
		for(int i = 0; i < map.length-4; i++) {
			for(int j = 0; j < map.length-4; j++) {
					if(map[i][j] == color && map[i+1][j+1] == color && map[i+2][j+2] == color && map[i+3][j+3] == color && map[i+4][j+4] == color ) {
						key = 3;
						if((i+5) < map.length && (j+5) < map.length) {
							if(map[i+5][j+5] == color) { return false; }
						} 
					}
					
				}
			}
		for(int i = 0; i < map.length-4; i++) {
			for(int j = 4; j < map.length; j++) {
					if(map[i][j] == color && map[i+1][j-1] == color && map[i+2][j-2] == color && map[i+3][j-3] == color && map[i+4][j-4] == color ) {
						key = 4;
						if((i+5) < map.length) {
							if(map[i+5][j-5] == color) { return false; }
						}
					}					
				}
		}

	if(key == 1 || key == 2 || key == 3 ||key == 4) { return true; }
	return false;
	}
}