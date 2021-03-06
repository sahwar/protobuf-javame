package net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javame;
// Generated by proto2javame, Fri Jul 01 23:12:03 CEST 2011.

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class ExampleObjectEnumJavaMe extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;

	private final String name;
	private static final int fieldNumberName = 2;

	private final String address;
	private static final int fieldNumberAddress = 3;
	private final boolean hasAddress;

	private final java.util.Vector color;
	private static final int fieldNumberColor = 4;

	private final int direction;
	private static final int fieldNumberDirection = 5;
	private final boolean hasDirection;

	private final java.util.Vector number;
	private static final int fieldNumberNumber = 6;


	public static Builder newBuilder() {
		return new Builder();
	}

	private ExampleObjectEnumJavaMe(final Builder builder) {
		if (builder.hasId && builder.hasName ) {
			this.id = builder.id;
			this.name = builder.name;
			this.address = builder.address;
			this.hasAddress = builder.hasAddress;
			this.color = builder.color;
			this.direction = builder.direction;
			this.hasDirection = builder.hasDirection;
			this.number = builder.number;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" id:" + builder.hasId + " name:" + builder.hasName + "");
		}
	}

	public static class Direction {
		public static int UP = 0;
		public static int DOWN = 1;

		public static String getStringValue(int value) {
			String retValue;

			switch(value) {
				case 0:
					retValue = "UP";
					break;
				case 1:
					retValue = "DOWN";
					break;
				default:
					retValue = "";
					break;
			}

			return retValue;
		}
	}

	public static class Color {
		public static int RED = 0;
		public static int BLUE = 1;

		public static String getStringValue(int value) {
			String retValue;

			switch(value) {
				case 0:
					retValue = "RED";
					break;
				case 1:
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
		private int id;
		private boolean hasId = false;

		private String name;
		private boolean hasName = false;

		private String address;
		private boolean hasAddress = false;

		private java.util.Vector color = new java.util.Vector();
		private boolean hasColor = false;

		private int direction;
		private boolean hasDirection = false;

		private java.util.Vector number = new java.util.Vector();
		private boolean hasNumber = false;


		private Builder() {
		}

		public Builder setId(final int id) {
			this.id = id;
			this.hasId = true;
			return this;
		}

		public Builder setName(final String name) {
			this.name = name;
			this.hasName = true;
			return this;
		}

		public Builder setAddress(final String address) {
			this.address = address;
			this.hasAddress = true;
			return this;
		}

		public Builder setColor(final java.util.Vector color) {
			if(!hasColor) {
				hasColor = true;
			}
			this.color = color;
			return this;
		}


		public Builder addElementColor(final int element) {
			if(!hasColor) {
				hasColor = true;
			}
			color.addElement(new Integer(element));
			return this;
		}

		public Builder setDirection(final int direction) {
			this.direction = direction;
			this.hasDirection = true;
			return this;
		}

		public Builder setNumber(final java.util.Vector number) {
			if(!hasNumber) {
				hasNumber = true;
			}
			this.number = number;
			return this;
		}


		public Builder addElementNumber(final long element) {
			if(!hasNumber) {
				hasNumber = true;
			}
			number.addElement(new Long(element));
			return this;
		}

		public ExampleObjectEnumJavaMe build() {
			return new ExampleObjectEnumJavaMe(this);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public boolean hasAddress() {
		return hasAddress;
	}

	public java.util.Vector getColor() {
		return color;
	}

	public int getDirection() {
		return direction;
	}

	public boolean hasDirection() {
		return hasDirection;
	}

	public java.util.Vector getNumber() {
		return number;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += "name = " + this.name + TAB;
		if(hasAddress) retValue += "address = " + this.address + TAB;
		retValue += "color = " + this.color + TAB;
		if(hasDirection) retValue += "direction = " + this.direction + TAB;
		retValue += "number = " + this.number + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberName, name);
		if(hasAddress) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberAddress, address);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberColor, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_INT, color);
		if(hasDirection) totalSize += ComputeSizeUtil.computeIntSize(fieldNumberDirection, direction);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberNumber, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_LONG, number);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberId, id);
		writer.writeString(fieldNumberName, name);
		if(hasAddress) writer.writeString(fieldNumberAddress, address);
		writer.writeList(fieldNumberColor, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_INT, color);
		if(hasDirection) writer.writeInt(fieldNumberDirection, direction);
		writer.writeList(fieldNumberNumber, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_LONG, number);
		writer.writeData();
	}

	static ExampleObjectEnumJavaMe parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final ExampleObjectEnumJavaMe.Builder builder = ExampleObjectEnumJavaMe.newBuilder();

		while (nextFieldNumber > 0) {
			if(!populateBuilderWithField(reader, builder, nextFieldNumber)) {
				reader.getPreviousTagDataTypeAndReadContent();
			}
			nextFieldNumber = getNextFieldNumber(reader);
		}

		return builder.build();
	}

	static int getNextFieldNumber(final InputReader reader) throws IOException {
		return reader.getNextFieldNumber();
	}

	static boolean populateBuilderWithField(final InputReader reader, final Builder builder, final int fieldNumber) throws IOException {
		boolean fieldFound = true;
		switch (fieldNumber) {
			case fieldNumberId:
				builder.setId(reader.readInt(fieldNumber));
				break;
			case fieldNumberName:
				builder.setName(reader.readString(fieldNumber));
				break;
			case fieldNumberAddress:
				builder.setAddress(reader.readString(fieldNumber));
				break;
			case fieldNumberColor:
				builder.addElementColor(reader.readInt(fieldNumber));
				break;
			case fieldNumberDirection:
				builder.setDirection(reader.readInt(fieldNumber));
				break;
			case fieldNumberNumber:
				builder.addElementNumber(reader.readLong(fieldNumber));
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		ExampleObjectEnumJavaMe.unknownTagHandler = unknownTagHandler;
	}

	public static ExampleObjectEnumJavaMe parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static ExampleObjectEnumJavaMe parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static ExampleObjectEnumJavaMe parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}