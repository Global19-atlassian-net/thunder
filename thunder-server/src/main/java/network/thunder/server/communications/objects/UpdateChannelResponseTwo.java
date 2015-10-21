/*
 *  ThunderNetwork - Server Client Architecture to send Off-Chain Bitcoin Payments
 *  Copyright (C) 2015 Mats Jerratsch <matsjj@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package network.thunder.server.communications.objects;

import network.thunder.server.database.objects.Key;
import network.thunder.server.database.objects.Secret;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc

/**
 * The Class UpdateChannelResponseTwo.
 */
public class UpdateChannelResponseTwo {

    /**
     * The secret list.
     */
    public ArrayList<Secret> secretList;

    /**
     * The key list.
     */
    public ArrayList<Key> keyList;

    /**
     * The removed payments.
     */
    public ArrayList<String> removedPayments;

    /**
     * The channel transaction.
     */
    public String channelTransaction;
}
