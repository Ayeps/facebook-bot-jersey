package facebookbot.facebook.bot.jersey.models.webhook;

import facebookbot.facebook.bot.jersey.models.common.Recipient;

/**
 * Created by genki.furumi on 4/14/16.
 */
public class Messaging {
    public Sender sender;
    public Recipient recipient;
    public String timeStamp;
    public Message message;
    public Postback postback;
    public Delivery delivery;
}
