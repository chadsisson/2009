package com.runescape;

public enum SideIcon {

	COMBAT(431),
	STATS(432),
	QUEST(433),//433
	INVENTORY(434),
	EQUIPMENT(435),
	PRAYER(436),
	SPELLBOOK(437),
	CLAN(438),
	FRIENDS_IGNORE_LIST(439),
	PROFILE(500),
	LOGOUT(441),
	SETTINGS(442),
	EMOTES(443),
	MUSIC(444);
	
	private int spriteId;
	
	SideIcon(int spriteID) {
		this.setSpriteId(spriteID);
	}
	
	public static SideIcon getIcon(int index) {
		return values()[index];
	}

	public int getSpriteId() {
		return spriteId;
	}

	public void setSpriteId(int spriteId) {
		this.spriteId = spriteId;
	}
}