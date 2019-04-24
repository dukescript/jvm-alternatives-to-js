package com.athaydes;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;
import com.athaydes.js.PlatformServices;

@Model(className = "Data", targetId = "", instance = true, properties = {
    @Property(name = "value", type = int.class),
})
final class DataModel {
    private PlatformServices services;


    @Function static void increment(Data model) {
        model.setValue(model.getValue() + 1);
    }

    @Function static void decrement(Data model) {
        model.setValue(model.getValue() - 1);
    }

    /**
     * Called when the page is ready.
     */
    static void onPageLoad(PlatformServices services) {
        Data ui = new Data();
//        ui.initServices(services);
        ui.applyBindings();
    }
}
