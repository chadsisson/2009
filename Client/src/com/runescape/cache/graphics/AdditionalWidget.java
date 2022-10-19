package com.runescape.cache.graphics;

public class AdditionalWidget extends Widget {
	
	 public static void decode(GameFont textDrawingAreas[]) {

		friendsList();
		ignoreList();
		questTab(textDrawingAreas);

	 }
		public static void friendsList() {
			
			Widget rsinterface = interfaceCache[5065];
			addHoverButton_sprite_loader(30000, 492, 15, 15, "View Ignore List", -1, 30001, 1);
			addHoveredButton_sprite_loader(30001, 493, 15, 15, 30002);
			
			setBounds(30000, 170, 2, 26, rsinterface);
			setBounds(30001, 170, 2, 27, rsinterface); 
			
		}
		
		public static void ignoreList() {
			
			Widget rsinterface = interfaceCache[5715];
			addHoverButton_sprite_loader(30030, 494, 15, 15, "View Friends List", -1, 30031, 1);
			addHoveredButton_sprite_loader(30031, 495, 15, 15, 30032);
			
			setBounds(30030, 170, 2, 26, rsinterface); 
			setBounds(30031, 170, 2, 27, rsinterface);
			
		}
		
		public static void questTab(GameFont[] tda) {
			
			Widget rsinterface = interfaceCache[638];
			addHoverButton_sprite_loader(30050, 506, 18, 18, "View Achievement List", -1, 30051, 1);
			addHoveredButton_sprite_loader(30051, 507, 18, 18, 30052);
			
			addHoverButton_sprite_loader(30053, 508, 18, 18, "View Minigames", -1, 30054, 1);
			addHoveredButton_sprite_loader(30054, 509, 18, 18, 30055);

			addHoverButton_sprite_loader(30056, 510, 18, 18, "View Kourend Favour", -1, 30057, 1);
			addHoveredButton_sprite_loader(30057, 511, 18, 18, 30058);
			
			setBounds(7342, 50, 2, 24, rsinterface); 

			setBounds(30050, 134, 2, 24, rsinterface); 
			setBounds(30051, 134, 2, 25, rsinterface);
			
			setBounds(30053, 152, 2, 26, rsinterface); 
			setBounds(30054, 152, 2, 27, rsinterface);
			
			setBounds(30056, 170, 2, 28, rsinterface); 
			setBounds(30057, 170, 2, 29, rsinterface);
		}
	}
