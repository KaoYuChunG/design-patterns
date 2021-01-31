package com.examples.ai.player;

import com.examples.ai.Input;
import com.examples.ai.Player;

public class HumanPlayer extends Player {

	@Override
	protected String nameSelf() {
		return Input.next("請輸入名稱");
	}

	@Override
	protected String getPlayerType() {
		return "玩家";
	}

	@Override
	protected int guess(int min, int max) {
		return Input.nextInt(min,max);
	}

}
