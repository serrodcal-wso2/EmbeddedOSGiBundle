package com.serrodcal.EmbeddedOSGiBundleMediator;

import com.jayway.jsonpath.JsonModel;
import net.minidev.json.JSONObject;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

/**
 * Created by serrodcal on 29/6/17.
 */
public class EmbeddedOSGiBundleMediator extends AbstractMediator {

    public boolean mediate(MessageContext messageContext) {
        return true;
    }

}
