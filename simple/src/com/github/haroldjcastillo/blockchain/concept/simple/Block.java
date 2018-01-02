package com.github.haroldjcastillo.blockchain.concept.simple;

import java.util.Arrays;

/**
 * @author haroldjcastillo
 *
 */
public class Block {

	private int previousHash;
	private String[] transactions;
	private int blockHash;

	public Block(int previousHash, String[] transactions) {
		super();
		this.previousHash = previousHash;
		this.transactions = transactions;
		final Object[] contents = { Arrays.hashCode(transactions), previousHash };
		this.blockHash = Arrays.hashCode(contents);
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public String[] getTransactions() {
		return transactions;
	}

	public int getBlockHash() {
		return blockHash;
	}

}
