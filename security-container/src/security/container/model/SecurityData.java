package security.container.model;

import java.io.Serializable;

/**
 * Self-Contained Tetrahedral Security Data Model
 * 
 * @author RunhuaXU
 * 
 */
public class SecurityData implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private FacetBasic basic;
	private FacetCipher cipher;
	private FacetPolicy policy;
	private FacetTrack track;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the basic
	 */
	public FacetBasic getBasic() {
		return basic;
	}

	/**
	 * @param basic
	 *            the basic to set
	 */
	public void setBasic(FacetBasic basic) {
		this.basic = basic;
	}

	/**
	 * @return the cipher
	 */
	public FacetCipher getCipher() {
		return cipher;
	}

	/**
	 * @param cipher
	 *            the cipher to set
	 */
	public void setCipher(FacetCipher cipher) {
		this.cipher = cipher;
	}

	/**
	 * @return the policy
	 */
	public FacetPolicy getPolicy() {
		return policy;
	}

	/**
	 * @param policy
	 *            the policy to set
	 */
	public void setPolicy(FacetPolicy policy) {
		this.policy = policy;
	}

	/**
	 * @return the track
	 */
	public FacetTrack getTrack() {
		return track;
	}

	/**
	 * @param track
	 *            the track to set
	 */
	public void setTrack(FacetTrack track) {
		this.track = track;
	}

}
