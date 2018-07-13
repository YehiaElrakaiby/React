/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug;

public class AdaptiveCyberDefenseDebugCommunicationHelper {
	
	public void sendEvent(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage sendAndReceive(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage receivedMessage = org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.debug.AdaptiveCyberDefenseDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
