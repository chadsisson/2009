package com.runescape.cache.graphics;

public class SettingsWidget extends Widget {
	
	
	
    public static final int RUN = 42615;

	public static void decode(GameFont[] textDrawingAreas) {
		Display(textDrawingAreas);
		Audio(textDrawingAreas);
		test(textDrawingAreas);
	}
	
	 public static void test(GameFont[] textDrawingAreas) {
	        Widget tab = addTabInterface(42800);

	        addSpriteLoader(42801, 548); // Frame
	        /* Top buttons */
	        configHoverButton(42802, "Display", 532, 533, 534, 535, true, new int[]{42503, 42504, 42505});
	        configHoverButton(42803, "Audio", 536, 537, 538, 539, false, new int[]{42502, 42504, 42505});
	        configHoverButton(42804, "Chat", 540, 541, 542, 543, false, new int[]{42502, 42503, 42505});
	        configHoverButton(42805, "Controls", 544, 545, 546, 547, false, new int[]{42502, 42503, 42504});


	        tab.totalChildren(2);
	        int childNum = 0;

	        setBounds(42801, 3, 42, childNum++, tab);
	        setBounds(42802, 6, 0, childNum++, tab);
	        int x = 0;
	        for (int i = 0; i < 4; i++, x += 46) {
	           // setBounds(42802 + i, 6 + x, 0, childNum++, tab);
	           // setBounds(42806 + i, 6 + x, 219, childNum++, tab);
	        }


	    }
	
	

	public static void Display(GameFont[] textDrawingAreas) {
		Widget tab = addTabInterface(42600);
		
		addSprite(42601, 548);
		
		addHoverButton_sprite_loader(42602, 532, 40, 40, "Display", -1, 42603, 1);
		addHoveredButton_sprite_loader(42603, 533, 40, 40, 42604);
		
		addHoverButton_sprite_loader(42605, 536, 40, 40, "Audio", -1, 42606, 1);
		addHoveredButton_sprite_loader(42606, 537, 40, 40, 42607);
		
		addHoverButton_sprite_loader(42608, 540, 40, 40, "Chat", -1, 42609, 1);
		addHoveredButton_sprite_loader(42609, 541, 40, 40, 42610);
		
		addHoverButton_sprite_loader(42611, 544, 40, 40, "Controls", -1, 42612, 1);
		addHoveredButton_sprite_loader(42612, 545, 40, 40, 42613);
		
		addConfigButton(42614, 42600, 550, 549, 40, 40, "Accept Aid", 0, 1, 0);
		addConfigButton(RUN, 42600, 551, 552, 40, 40, "Run", 1, 1, 152);
		addConfigButton(42616, 42600, 553, 554, 40, 40, "House Options", 0, 1, 0);
		addConfigButton(42617, 42600, 555, 555, 40, 40, "Bond Pouch", 0, 1, 0);
		
		
		tab.totalChildren(13);
		int childId = 0;
		
		setBounds(42601, 3, 42, childId++, tab);
		
		setBounds(42602, 6, 0, childId++, tab);
		setBounds(42603, 6, 0, childId++, tab);
		
		setBounds(42605, 52, 0, childId++, tab);
		setBounds(42606, 52, 0, childId++, tab);
		
		setBounds(42608, 98, 0, childId++, tab);
		setBounds(42609, 98, 0, childId++, tab);
		
		setBounds(42611, 144, 0, childId++, tab);
		setBounds(42612, 144, 0, childId++, tab);
		
		setBounds(42614, 6, 219, childId++, tab);
		setBounds(42615, 52, 219, childId++, tab);
		setBounds(42616, 98, 219, childId++, tab);
		setBounds(42617, 144, 219, childId++, tab);
	}
	
	public static void Audio(GameFont[] textDrawingAreas) {
		Widget tab = addTabInterface(42700);

		addHoverButton_sprite_loader(42702, 534, 40, 40, "Display", -1, 42703, 1);
		addHoveredButton_sprite_loader(42703, 535, 40, 40, 42704);
		
		addHoverButton_sprite_loader(42705, 538, 40, 40, "Audio", -1, 42706, 1);
		addHoveredButton_sprite_loader(42706, 539, 40, 40, 42707);
		
		tab.totalChildren(13);
		int childId = 0;
		
		setBounds(42601, 3, 42, childId++, tab);
		
		setBounds(42702, 6, 0, childId++, tab);
		setBounds(42703, 6, 0, childId++, tab);
		
		setBounds(42705, 52, 0, childId++, tab);
		setBounds(42706, 52, 0, childId++, tab);
		
		setBounds(42608, 98, 0, childId++, tab);
		setBounds(42609, 98, 0, childId++, tab);
		
		setBounds(42611, 144, 0, childId++, tab);
		setBounds(42612, 144, 0, childId++, tab);
		
		setBounds(42614, 6, 219, childId++, tab);
		setBounds(42615, 52, 219, childId++, tab);
		setBounds(42616, 98, 219, childId++, tab);
		setBounds(42617, 144, 219, childId++, tab);
		
		
	}
	
	
	
}
