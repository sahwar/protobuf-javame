package net.jarlehansen.protobuf.javame.generated;
// Generated by proto2javame, Sat Sep 04 22:41:01 CEST 2010.

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

public final class NestedTestObject2 extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int value;
	private static final int fieldNumberValue = 1;
	private final boolean hasValue;

	private final NestedTestObject3 nestedObj;
	private static final int fieldNumberNestedObj = 2;


	public static Builder newBuilder() {
		return new Builder();
	}

	private NestedTestObject2(final Builder builder) {
		if (builder.hasNestedObj ) {
			this.value = builder.value;
			this.hasValue = builder.hasValue;
			this.nestedObj = builder.nestedObj;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" nestedObj:" + builder.hasNestedObj + "");
		}
	}

	public static class Value {
		public static int SOMETHING = 1;
		public static int EVERYTHING = 2;

		public static String getStringValue(int value) {
			String retValue;

			switch(value) {
				case 1:
					retValue = "SOMETHING";
					break;
				case 2:
					retValue = "EVERYTHING";
					break;
				default:
					retValue = "";
					break;
			}

			return retValue;
		}
	}

	public static class Builder {
		private int value;
		private boolean hasValue = false;

		private NestedTestObject3 nestedObj;
		private boolean hasNestedObj = false;


		private Builder() {
		}

		public Builder setValue(final int value) {
			this.value = value;
			this.hasValue = true;
			return this;
		}

		public Builder setNestedObj(final NestedTestObject3 nestedObj) {
			this.nestedObj = nestedObj;
			this.hasNestedObj = true;
			return this;
		}

		public NestedTestObject2 build() {
			return new NestedTestObject2(this);
		}
	}

	public int getValue() {
		return value;
	}

	public boolean hasValue() {
		return hasValue;
	}

	public NestedTestObject3 getNestedObj() {
		return nestedObj;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		if(hasValue) retValue += "value = " + this.value + TAB;
		retValue += "nestedObj = " + this.nestedObj + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		if(hasValue) totalSize += ComputeSizeUtil.computeIntSize(fieldNumberValue, value);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;
		messageSize += ComputeSizeUtil.computeMessageSize(fieldNumberNestedObj, nestedObj.computeSize());

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		if(hasValue) writer.writeInt(fieldNumberValue, value);
		writer.writeMessage(fieldNumberNestedObj, nestedObj.computeSize());
		nestedObj.writeFields(writer);
		writer.writeData();
	}

	static NestedTestObject2 parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final NestedTestObject2.Builder builder = NestedTestObject2.newBuilder();

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
			case fieldNumberValue:
				builder.setValue(reader.readInt(fieldNumber));
				break;
			case fieldNumberNestedObj:
				reader.readMessageStart();
				NestedTestObject3.Builder builderNestedObj = NestedTestObject3.newBuilder();
				NestedTestObject3.populateBuilderWithField(reader, builderNestedObj, getNextFieldNumber(reader));
				builder.setNestedObj(builderNestedObj.build());
				break;
		default:
			reader.getPreviousTagDataTypeAndReadContent();
		}
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		NestedTestObject2.unknownTagHandler = unknownTagHandler;
	}

	public static NestedTestObject2 parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static NestedTestObject2 parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static NestedTestObject2 parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}