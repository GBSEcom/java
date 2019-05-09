package com.github.GBSEcom.simple;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Timestamp {
	public static final Long SECS_TO_MILLIS = 1000L;

	public static Timestamp now(ZoneId zoneId) {
		return new Timestamp(ZonedDateTime.now(zoneId));
	}

	public static Timestamp now() {
		return Timestamp.now(ZoneId.of("GMT"));
	}

	private final ZonedDateTime dateTime;

	public Long toMilliseconds() {
		return dateTime.toEpochSecond() * Timestamp.SECS_TO_MILLIS;
	}
}
