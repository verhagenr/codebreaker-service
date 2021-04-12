package us.nm.state.hsd.codebreaker.service;

import java.util.UUID;

public interface UUIDStringifier {

  String toString(UUID value);

  UUID fromString(String value) throws NumberFormatException;

}
