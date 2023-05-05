//ウィンドウ表示と命令受付を繰り返すようにしたい。

//gwインスタンスの生成を１回にした結果、ウィンドウは１枚で済むようになった。
//しかし、内容が更新されていない。
//ただ、utusi()の方は更新されていて、ちゃんとprintされている。
//つまり、moji[i][j]はちゃんと更新されている。

//gwウィンドウにaddでtamaの情報を加える部分でclearを使って更新してみる。→typeがリストじゃないからダメだった。
//addによってごまかされているが、ちゃんとpaintメソッドを使う方法を調べるところから次回はやってくれ。
//または、appletとやらを試してみるのもあり。

package WindowArray5;

import java.util.*;
 
class ReadArray8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DrawCanvas8 tama = new DrawCanvas8();
		GameWindow8 gw = new GameWindow8("テストウィンドウ",400,300);


		int r = sc.nextInt();
		int c = sc.nextInt();
		String t = sc.nextLine();
		char[][] map = new char[r][c];  //２次元配列を定義
		for (int i=0; i<r; i++){
			String str = sc.nextLine();
			char[] tmp = str.toCharArray();
			for (int j=0; j<c; j++) map[i][j] = tmp[j];  //分割した１文字を配列に格納
		}

		String[][] map2 = new String[r][c];
		for (int i=0; i<r; i++){
			for (int j=0; j<c; j++){
				map2[i][j] = String.valueOf(map[i][j]);  //char→Stringに１文字ずつ変換している。
			}
		}
		
		tama.moji = map2;
		tama.r_tama = r;
		tama.c_tama = c;

		gw.add(tama);
		gw.setVisible(true);

		tama.utusi();  //予想外にも２次元配列の受け渡しはできていた。


		for (int k=0; k<2; k++){  //3回まで繰り返すようにした。
			int r_rep = sc.nextInt();
			int c_rep = sc.nextInt();
			String t_rep = sc.nextLine();
			char[][] map_rep = new char[r_rep][c_rep];  //２次元配列を定義
			for (int i=0; i<r_rep; i++){
				String str = sc.nextLine();
				char[] tmp = str.toCharArray();
				for (int j=0; j<c_rep; j++) map[i][j] = tmp[j];  //分割した１文字を配列に格納
			}

			String[][] map2_rep = new String[r_rep][c_rep];
			for (int i=0; i<r_rep; i++){
				for (int j=0; j<c_rep; j++){
					map2[i][j] = String.valueOf(map[i][j]);  //char→Stringに１文字ずつ変換している。
				}
			}
			
			tama.moji = map2;
			tama.r_tama = r_rep;
			tama.c_tama = c_rep;

			// gw.clear();  //typeがダメだとエラー出た。GameWindow8のtypeはリストじゃないので対応方法が無い。
			gw.add(tama);
			// tama.paintComponent();  //addによってごまかされているが、ちゃんとpaintメソッドを使った方がいい。
			                           //repaint使った方がいいか？
			gw.setVisible(true);

			tama.utusi();  //予想外にも２次元配列の受け渡しはできていた。
		}
	}
}
