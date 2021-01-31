package com.examples.ai.player.ai;

import com.examples.ai.player.AI;

import java.util.Random;

public class OddAI extends AI {

	@Override
	protected String getPlayerType() {
		return "OddAI";
	}

	@Override
	protected int guess(int min, int max) {
		int rand;
		if ( max == min )
			return max;
		do
		{
			rand = new Random().nextInt(max-min)+min;
		}while(rand % 2 != 1 || rand < min || rand > max );  //retain odd and bounded
		return rand;
	}

}
