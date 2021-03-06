package net.fortuna.ical4j.validate.component;

import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.component.VAlarm;
import net.fortuna.ical4j.validate.PropertyValidator;
import net.fortuna.ical4j.validate.ValidationException;
import net.fortuna.ical4j.validate.Validator;

/**
 * Created by fortuna on 12/09/15.
 */
public class VAlarmAudioValidator implements Validator<VAlarm> {

    private static final long serialVersionUID = 1L;

    /**
     * {@inheritDoc}
     */
    public void validate(VAlarm target) throws ValidationException {
        /*
         * ; the following is optional, ; but MUST NOT occur more than once attach /
         */
        PropertyValidator.getInstance().assertOneOrLess(Property.ATTACH, target.getProperties());
    }
}
