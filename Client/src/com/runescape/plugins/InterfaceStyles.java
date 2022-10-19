package com.runescape.plugins;

import com.runescape.Client;
import com.runescape.Configuration;
import com.runescape.Client.ScreenMode;

public class InterfaceStyles extends Client {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4045632372208749979L;
	static int tabId;
	
	
	public void draw07Stones() {
		final int[] 
			redStonesX = {22, 44, 77, 110, 143, 176, 209, 6, 44, 77, 110, 143, 176, 209},
			redStonesY = {2, 0, 0, 0, 0, 0, 0, 298, 298, 298, 298, 298, 298, 298},
			redStonesId = {63, 68, 72, 39, 39, 39, 36, 37, 39, 39, 39, 39, 39, 38};

		int xOffset = frameMode == ScreenMode.FIXED ? 0 : frameWidth - 247;
		int yOffset = frameMode == ScreenMode.FIXED ? 0 : frameHeight - 336;
		if (frameMode == ScreenMode.FIXED || frameMode != ScreenMode.FIXED && !changeTabArea) {
			if (tabInterfaceIDs[tabId] != -1 && tabId != 15) {
				cacheSprite[redStonesId[tabId]].drawSprite(redStonesX[tabId] + xOffset,
						redStonesY[tabId] + yOffset);
			}
		} else if (changeTabArea && frameWidth < 1000) {
			int[] stoneX = {226, 194, 162, 130, 99, 65, 34, 219, 195, 161, 130, 98, 65, 33};
			int[] stoneY = {73, 73, 73, 73, 73, 73, 73, -1, 37, 37, 37, 37, 37, 37, 37};
			if (tabInterfaceIDs[tabId] != -1 && tabId != 10 && showTabComponents) {
				if (tabId == 7) {
					cacheSprite[39].drawSprite(frameWidth - 130, frameHeight - 37);
				}
				cacheSprite[39].drawSprite(frameWidth - stoneX[tabId],
						frameHeight - stoneY[tabId]);
			}
		} else if (changeTabArea && frameWidth >= 1000) {
			int[] stoneX =
				{417, 385, 353, 321, 289, 256, 224, 129, 193, 161, 130, 98, 65, 33};
			if (tabInterfaceIDs[tabId] != -1 && tabId != 10 && showTabComponents) {
				cacheSprite[39].drawSprite(frameWidth - stoneX[tabId], frameHeight - 37);
			}
		}
	} 
	
	public static void drawMinimap() {
		int yOffset = frameMode == ScreenMode.FIXED ? 0 : frameHeight - 165;
		int InterfaceStyle1 = 19;
		int InterfaceStyle2 = 514;
		cacheSprite[Configuration.enableRoofs ? InterfaceStyle2 : InterfaceStyle1].drawSprite(0, yOffset);
	}
	
	public static void drawChatArea() {
		int yOffset = frameMode == ScreenMode.FIXED ? 0 : frameHeight - 165;
		int InterfaceStyle1 = 20;
		int InterfaceStyle2 = 61;
		cacheSprite[Configuration.enableRoofs ? InterfaceStyle2 : InterfaceStyle1].drawSprite(0, yOffset);
	}
	
	public static void drawTabArea() {
		if (frameMode == ScreenMode.FIXED) {
			int InterfaceStyle1 = 21;
			int InterfaceStyle2 = 62;
			cacheSprite[Configuration.enableRoofs ? InterfaceStyle2 : InterfaceStyle1].drawSprite(frameMode == ScreenMode.FIXED ? 0 : 0, 0);
		}
	}
}
