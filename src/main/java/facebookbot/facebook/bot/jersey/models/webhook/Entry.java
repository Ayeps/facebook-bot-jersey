package facebookbot.facebook.bot.jersey.models.webhook;

import java.util.List;

/**
 * Created by genki.furumi on 4/14/16.
 */
public class Entry {
    public String id;
    public String time;
    public List<Messaging> messaging;
}
