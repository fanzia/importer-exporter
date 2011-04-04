package de.tub.citydb.components.preferences.gui.preferences.entries;

import de.tub.citydb.config.internal.Internal;
import de.tub.citydb.gui.preferences.DefaultPreferencesEntry;
import de.tub.citydb.gui.preferences.NullComponent;

public class RootPreferencesEntry extends DefaultPreferencesEntry {

	public RootPreferencesEntry() {
		super(NullComponent.getInstance());
	}
	
	@Override
	public String getTitle() {
		return Internal.I18N.getString("pref.tree.root");
	}

}
