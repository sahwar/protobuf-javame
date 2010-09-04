package net.jarlehansen.protobuf.javame.generated;
// Generated by proto2javame, Sat Sep 04 23:21:59 CEST 2010.

import java.io.IOException;
import java.io.InputStream;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class EnumTestObject extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int color;
	private static final int fieldNumberColor = 1;


	public static Builder newBuilder() {
		return new Builder();
	}

	private EnumTestObject(final Builder builder) {
		if (builder.hasColor ) {
			this.color = builder.color;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" color:" + builder.hasColor + "");
		}
	}

	public static class Color {
		public static int RED = 1;
		public static int BLUE = 2;

		public static String getStringValue(int value) {
			String retValue;

			switch(value) {
				case 1:
					retValue = "RED";
					break;
				case 2:
					retValue = "BLUE";
					break;
				default:
					retValue = "";
					break;
			}

			return retValue;
		}
	}

	public static class Builder {
		private int color;
		private boolean hasColor = false;


		private Builder() {
		}

		public Builder setColor(final int color) {
			this.color = color;
			this.hasColor = true;
			return this;
		}

		public EnumTestObject build() {
			return new EnumTestObject(this);
		}
	}

	public int getColor() {
		return color;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "color = " + this.color + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberColor, color);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberColor, color);
		writer.writeData();
	}

	static EnumTestObject parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final EnumTestObject.Builder builder = EnumTestObject.newBuilder();

		while (nextFieldNumber > 0) {
			populateBuilderWithField(reader, builder, nextFieldNumber);
			nextFieldNumber = getNextFieldNumber(reader);
		}

		return builder.build();
	}
	static int getNextFieldNumber(final InputReader reader) throws IOException {
		return reader.getNextFieldNumber();
	}

	static void populateBuilderWithField(final InputReader reader, final Builder builder, final int fieldNumber) throws IOException {
		switch (fieldNumber) {
			case fieldNumberColor:
				builder.setColor(reader.readInt(fieldNumber));
				break;
		default:
			reader.getPreviousTagDataTypeAndReadContent();
		}
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		EnumTestObject.unknownTagHandler = unknownTagHandler;
	}

	public static EnumTestObject parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static EnumTestObject parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static EnumTestObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}