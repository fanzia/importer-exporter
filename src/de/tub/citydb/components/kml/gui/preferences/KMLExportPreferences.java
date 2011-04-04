package de.tub.citydb.components.kml.gui.preferences;

import de.tub.citydb.components.kml.gui.preferences.components.AltitudePanel;
import de.tub.citydb.components.kml.gui.preferences.components.BalloonPanel;
import de.tub.citydb.components.kml.gui.preferences.components.GeneralPanel;
import de.tub.citydb.components.kml.gui.preferences.entries.KMLExportEntry;
import de.tub.citydb.config.Config;
import de.tub.citydb.gui.ImpExpGui;
import de.tub.citydb.gui.preferences.AbstractPreferences;
import de.tub.citydb.gui.preferences.DefaultPreferencesEntry;

public class KMLExportPreferences extends AbstractPreferences {
	
	public KMLExportPreferences(ImpExpGui mainView, Config config) {
		super(new KMLExportEntry());
		
		entry.addChildEntry(new DefaultPreferencesEntry(new GeneralPanel(config, mainView)));
		entry.addChildEntry(new DefaultPreferencesEntry(new BalloonPanel(config)));
		entry.addChildEntry(new DefaultPreferencesEntry(new AltitudePanel(config)));
	}

}
