package com.github.haroldjcastillo.blockchain.concept.simple;

/**
 * @author haroldjcastillo
 *
 */
public class Main {

	public static void main(final String[] args) {

		// The most simple transaction, this is only for know how hash function works in
		// blockchain.
		final String[] firstTransaction = { "A sent B 100000 coins" };
		final Block firstBlock = new Block(0, firstTransaction);

		final String[] secondTransaction = { "B sent A 100 coins" };
		final Block secondBlock = new Block(firstBlock.getBlockHash(), secondTransaction);

		final String[] thirdTransaction = { "C sent A 1 coin" };
		final Block thirdBlock = new Block(secondBlock.getBlockHash(), thirdTransaction);

		System.out.println("Hash of first block: " + firstBlock.getBlockHash());
		System.out.println("Hash of second block: " + secondBlock.getBlockHash());
		System.out.println("Hash of third block: " + thirdBlock.getBlockHash());
	}
}
