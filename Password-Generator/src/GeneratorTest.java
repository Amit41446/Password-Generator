
class GeneratorTest {
	
	private final Password password= new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
	private final Generator generator = new Generator(true,false,false,false);
//	private final Password generatedPassword = generator.GeneratePassword(4);
	
	@Test
        @SuppressWarnings("unused")
	void test1() {
		assertEquals("Secret", password.toString());
	}

	@Test
        @SuppressWarnings("unused")
	void test2() {
		assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
	}

	@Test
        @SuppressWarnings("unused")
	void test3() {
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS);
	}
	
	@Test
        @SuppressWarnings("unused")
	void test4() {
		assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
	}
	
	@Test
        @SuppressWarnings("unused")
	void test5() {
		assertEquals(generator.alphabet.getAlphabet().length(), 26);
	}

    private void assertEquals(int length, int i) {
	
		throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
	}

	private void assertEquals(String secret, String toString) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
