package security.container.model;

import java.io.Serializable;

public class FacetCipher implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte[] cipher;
	private byte[] keyCipher;

	/**
	 * @return the cipher
	 */
	public byte[] getCipher() {
		return cipher;
	}

	/**
	 * @param cipher
	 *            the cipher to set
	 */
	public void setCipher(byte[] cipher) {
		this.cipher = cipher;
	}

	/**
	 * @return the keyCipher
	 */
	public byte[] getKeyCipher() {
		return keyCipher;
	}

	/**
	 * @param keyCipher
	 *            the keyCipher to set
	 */
	public void setKeyCipher(byte[] keyCipher) {
		this.keyCipher = keyCipher;
	}

}
