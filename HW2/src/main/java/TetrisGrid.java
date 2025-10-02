public class TetrisGrid {
	private boolean[][] ban;  

	/**Contructor.
	 *
	 */
	public TetrisGrid(boolean[][] ban) {
		this.ban = ban;
	}

	/**Kiem tra.
	 *
	 */
	private boolean hangDay(int h) {
		for (int c = 0; c < ban.length; c++) {
			if (!ban[c][h]) return false;
		}
		return true;
	}

	/**Dich cac hang tu y len xuong 1 bac.
	 *
	 *
	 */
	private void dichXuong(int tuHang) {
		int cot = ban.length;
		int hang = ban[0].length;

		for (int h = tuHang; h < hang - 1; h++) {
			for (int c = 0; c < cot; c++) {
				ban[c][h] = ban[c][h + 1];
			}
		}

		/**Lam trong hang tren cung.
		 *
		 */
		for (int c = 0; c < cot; c++) {
			ban[c][hang - 1] = false;
		}
	}

	/**Xoa hang day.
	 *
	 */
	public void clearRows() {
		int hang = ban[0].length;
		for (int h = 0; h < hang; h++) {
			if (hangDay(h)) {
				dichXuong(h);
				h--;
			}
		}
	}

	/**Tra ve bang.
	 *
	 */
	public boolean[][] getGrid() {
		return ban;
	}
}
